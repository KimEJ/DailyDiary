const Hapi = require('hapi');

const server = new Hapi.Server();
server.connection({
    host: 'localhost',
    port: 5000
});

server.register({
    register: require('hapi-mysql'),
    options: {
        host: 'localhost',
        database: 'daily_diary',
        user: 'your-database-username',    // set your database username
        password: 'your-database-password'    // set your database password
    }

}, (error) => {
    if (error) {
        throw error;
    }
});

server.register({
    register: require('yar'),
    options: {
        cookieOptions: {
            password: 'min 32 characters',
            isSecure: false
        }
    }

}, (err) => {
    if (err) {
        throw err;
    }
});

let accountRoute = require('./lib/routes/account-route');
accountRoute(server);

let noteRoute = require('./lib/routes/note-route');
noteRoute(server);

server.start(() => {
    console.log(`server was started at: ${server.info.uri}`);
});
