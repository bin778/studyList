const { text } = require("express");
const os = require("os");
const path = require("path");

const System = {
    info: () => {
        console.log("os version ===> " + os.version);
        console.log("os srch() ===> " + os.arch());
        console.log("os.freemem() ===> " + os.freemem());
        console.log("os.homedir() ===> " + os.homedir());
        console.log("os.hostname() ===> " + os.hostname());
        console.log("os.totalmen() ===> " + os.totalmem());
        console.log("os.uptime() ===> " + os.uptime());
        console.log("os.networkInterface() ===> " );
        console.log(os.networkInterfaces());
    },
    path: () => {
        console.log("path.join() ===> " + path.join("c:/", "programs", "text.txt"));
        console.log("path.dirname() ===> " + path.dirname("c:/programs/text.txt"));
        console.log("path.basename() ===> " + path.basename("c:/program/text.txt"));
        console.log("path.extname() ===> " + path.extname("c:/programs/text.txt"));
    }
}

module.exports = System;