## Thymio Java Connect

This is a java example to connect to a Thymio device using Thymio Device Manager

## Details

This application is based on the documentation :
- https://mobsya.github.io/aseba/thymio-device-manager.html


## Problems

For instance, this project don't work. The problem is to define the "Node Id".
The line `99` on the ThymioSender.java is not correct. I need to create an offsetId, but i didn't undertand what is the good reference on the thymioNode object.

