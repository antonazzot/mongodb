conn = new Mongo();
db = conn.getDB("mongodb");


db.myCollectionName.createIndex({ "address.zip": 1 }, { unique: false });
// db.grantRolesToUser( "writeApp", [ "readWrite" ] );
db.createUser({
    user: "root",
    pwd: "hello",
    roles: [ { role: "userAdminAnyDatabase", db: "admin" }, "readWriteAnyDatabase" ]
});
