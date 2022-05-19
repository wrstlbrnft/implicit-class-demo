## Message Definition
- proto2: [cat.proto](src/main/protobuf/cat.proto)
  ```protobuf
  message Cat {
    optional string name   = 1;
    optional Cat    mother = 2;
  }
  ```
- Avro
  ```json
  {
    "namespace": "cats.avro",
    "type"     : "record",
    "name"     : "Cat",
    "fields"   : [
      {"name": "name",   "type": ["null", "string"]},
      {"name": "mother", "type": ["null", "Cat"]}
    ]
  }
  ```
- proto3
  ```protobuf
  message Cat {
    string name   = 1;
    Cat    mother = 2;
  }
  ```
#
#
[next](6-Dealing_With_Optionality.md)