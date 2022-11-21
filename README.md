# SpringSecurityWithKeyCloak
## Simple System with KeyCloak, you need to init keycloak with Docker or anything else and create/configure Client that have a name of "keycloak-security" and Roles
## if you wanna run with Docker: docker run -p 8080:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:20.0.1 start-dev
## you have to configure the KeyCloak with a client that have 2 Roles "user" and "admin" and you have to put localhost:9090 at Root Url in client
## also in there i'm using auth 2.0 so you need to testing using Postman at auth 2.0 authorization using the credentials of the user you created and the name of client in the scope you might use "openid"
