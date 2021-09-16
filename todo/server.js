const { TodoItem, TodoItems } = require("./model/todo_pb");
const grpc = require("grpc");
const protoLoader = require("@grpc/proto-loader");

const packageDef = protoLoader.loadSync("./todo.proto", {});
const grpcObject = grpc.loadPackageDefinition(packageDef);
const todoPackage = grpcObject.todoPackage;


const server = new grpc.Server();
server.addService(todoPackage.Todo.service, { createTodo, readTodos, readTodosStream });
server.bind("0.0.0.0:40000", grpc.ServerCredentials.createInsecure());
server.start();

const todos = [];


function createTodo({ request: { id, text } }, callback) {
    let newTodo = { "id": todos.length + 1, "text": text };
    todos.push(newTodo);
    return callback(null, newTodo);
}

function readTodos(call, callback) {
    // console.log(TodoItem);
    return callback(null, { "items": todos });
}

function readTodosStream(call, callback) {
    todos.forEach(it => call.write(it));
    call.end();
}