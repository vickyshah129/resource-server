# resource-server
This can be added to any project which consume our **authorization-server** to authenticate and authorize any request.

1. This is a standalone resource server which can authenticate from our this separate [authorization-server](https://github.com/vickyshah129/authorization-server)
2. Keep in mind that below properties have to be exactly same as of the authorization server's
 - security.signing-key=
 - security.encoding-strength=
 - security.security-realm=
3. It is just a base project and not production ready. Take it as an example to play with it further.
