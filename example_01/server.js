const grpc = require("grpc");
// const grpc = require("@grpc/grpc-js");
const protoLoader = require('@grpc/proto-loader');

// const NotesDefinition = grpc.loadPackageDefinition(
//     protoLoader.loadSync("./proto/notes.proto")
// );

const NotesDefinition = grpc.load(
    require("path").resolve("./proto/notes.proto")
);

const notes = [
    { id: "1", title: "Note 1", description: "Content 1" },
    { id: "2", title: "Note 2", description: "Content 2" },
];

function Find(call, callback) {
    console.log("TITLE: " + call.request.title);
    return callback(
        null,
        notes.find((note) => note.id === call.request.id || note.title === call.request.title)

    );
}


function List(_, callback) {
    return callback(null, notes);
}


const server = new grpc.Server();
server.addService(NotesDefinition.NoteService.service, { Find, List });

server.bindAsync("0.0.0.0:50051", grpc.ServerCredentials.createInsecure(), () => {
    server.start()
});