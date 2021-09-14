  const grpc = require('@grpc/grpc-js')
  const protoLoader = require('@grpc/proto-loader');

  const NotesDefinition = grpc.loadPackageDefinition(protoLoader.loadSync("./proto/notes.proto"))
      //   const NotesDefinition = grpc.load(require("path").resolve("./proto/notes.proto"));

  const client = new NotesDefinition.NoteService('localhost:50051', grpc.credentials.createInsecure())

  client.List({}, function(err, { notes }) {
      if (err) throw err
      console.log("LIST");
      console.log(notes)
  })

  //   client.find(Math.floor(Math.random() * 2 + 1).toString(), (err, note) => {
  client.find({ id: "1", title: "Note x" }, (err, note) => {
      if (err) throw err
      if (!note.id) return console.log('Note not found')

      console.log("FIND");

      return console.log(note)
  })