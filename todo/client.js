const grpc = require("grpc");
const protoLoader = require("@grpc/proto-loader");

const packageDef = protoLoader.loadSync("./todo.proto", {});
const grpcObject = grpc.loadPackageDefinition(packageDef);
const todoPackage = grpcObject.todoPackage;

const client = new todoPackage.Todo("localhost:40000", grpc.credentials.createInsecure());

const text = process.argv[2] || "Nothing"

client.createTodo({
    "id": -1,
    "text": text
}, (err, response) => {

    console.log("createTodo", response);
});

client.readTodos({}, (err, response) => {
    console.log(response);
})
const stream = client.readTodosStream();

stream.on("data", item => {

    console.log("stream: ", item);
});
stream.on("end", e => {
    console.log("stream server done! ");
});



function makeid(length) {
    var result = '';
    var characters = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789';
    var charactersLength = characters.length;
    for (var i = 0; i < length; i++) {
        result += characters.charAt(Math.floor(Math.random() *
            charactersLength));
    }
    return result;
}