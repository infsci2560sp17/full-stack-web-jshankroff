# TODO : Your Project Name

1.	What is the proposed name for your Web application?
	- TennisCollab
2.	Who is the target audience for your Web application?
	- Primary audience is tennis players, with a secondary audience of those interested in watching or playing the sport, and there is a tertiary audience, which could include general sports enthusiasts that don’t play but want to find information on it.
3.	What problem is it intended to solve for the target audience?
	- Many people don’t know much information about the specifics of playing tennis.  There are different types of strings, rackets, shoes, equipment, etc., that all play differently on the court.  There is not only just equipment that is important, but knowledge of patterns and strategies is also important as well as the process of stringing rackets.  Knowing how every specific thing works is tough for one experienced person.  In my site the user will be able to sort through everything and find out what they need to know.  I will include reviews, strategies, and tutorials for stringing rackets properly. 
4.	How will it meet the minimum project requirements?
	- The plan for my project is to make it free for everybody to use so they can be better educated on the game of tennis.  That being said, all of the content will be freely accessible, but the user will need to login to access everything and to interact with each other on the site.  The logins for the users will be stored in a database.  The users will be able to update their information, as well as delete their account if need be.
5.	Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
	- My site will accommodate for interaction with both the site, and with other users.  On my site I’ll interact with the users and provide suggestions and other commentary to users who want more information, or want to be better educated.  Any member that is inactive for some time will get messages to persuade them to visiting the site.


## Build status

TODO : Modify to match your project specific Travis Build
[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-jshankroff)

## Web Site

[Tennis Collaborating by Jordan Shankroff](https://whispering-tundra-49243.herokuapp.com)

## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.