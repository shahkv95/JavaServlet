
<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

<h1 align="center">Creating Java Servlet in Eclipse</h1>


<br />
<p align="center">
  <a href="https://github.com/othneildrew/Best-README-Template">
    <img src="images/eclipse.png">
  </a>

  

  <p align="center">
    A program to understand how Java Servlet works! 
    <br />
    <a href="https://github.com/othneildrew/Best-README-Template"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/othneildrew/Best-README-Template">View Demo</a>
    ·
    <a href="https://github.com/shahkv95/JavaServlet/issues">Report Bug</a>
    ·
    <a href="https://github.com/shahkv95/JavaServlet/issues">Request Feature</a>
  </p>
</p>



<!-- TABLE OF CONTENTS -->
## Table of Contents

* [About the Project](#about-the-project)
  * [Built With](#built-with)
* [Getting Started](#getting-started)
  * [Prerequisites](#prerequisites)
  * [Installation](#installation)
* [Usage](#usage)
* [Roadmap](#roadmap)
* [Contributing](#contributing)
* [License](#license)
* [Contact](#contact)
* [Acknowledgements](#acknowledgements)



<!-- ABOUT THE PROJECT -->
## About The Project

<img src="images/click.png" >

There are many great README templates available on GitHub, however, I didn't find one that really suit my needs so I created this enhanced one. I want to create a README template so amazing that it'll be the last one you ever need.

Here's why:
* Your time should be focused on creating something amazing. A project that solves a problem and helps others
* You shouldn't be doing the same tasks over and over like creating a README from scratch
* You should element DRY principles to the rest of your life :smile:

Of course, no one template will serve all projects since your needs may be different. So I'll be adding more in the near future. You may also suggest changes by forking this repo and creating a pull request or opening an issue.

A list of commonly used resources that I find helpful are listed in the acknowledgements.

### Built With
This project was built using the following tools/frameworks:

* [Apache Tomcat](http://tomcat.apache.org/)
* [Eclipse IDE](https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers)
* [Oracle Java Development Kit](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these simple example steps.

### Pre-requisites

This is an example of how to list things you need to use the software and how to install them.
* Apache Tomcat

> 1. Go to [Apache Tomcat](http://tomcat.apache.org/)
> 2. Download the latest stable version of Apache Tomcat Server. For this project, I have used [Apache Tomcat v9.0 Download](https://tomcat.apache.org/download-90.cgi)
> 3. When you are on this page - [Apache Tomcat v9.0 Download](https://tomcat.apache.org/download-90.cgi), download <b>apache-tomcat-9.0.39-windows-x64</b> by clicking on the option </b>64-bit Windows zip (pgp, sha512)</b>
> 4. Extract the files/ folders present in_ the downloaded files
> 5. Open the extracted folder(<b>apache-tomcat-9.0.39</b>). Go to bin and install the <b>tomcat9 application</b>


* Eclipse IDE

> 1. Go to [Eclipse IDE Download](https://www.eclipse.org/downloads/packages/release/helios/sr1/eclipse-ide-java-developers)
> 2. Download the latest stable version of Eclipse IDE. For this project, I have used [Eclipse Installer 2020-09 R](https://www.eclipse.org/downloads/download.php?file=/oomph/epp/2020-09/R/eclipse-inst-jre-win64.exe)
> 3. On downloading the installer, extract if_ a zip file is downloaded
> 4. Double click on the installer and install the <b>Eclipse IDE for Enterprise Java Developers</b>
> 5. Accept the required permission(after you agree to them by going through the terms and conditions) and finish the process to successfully install the IDE


* Oracle Java Development Kit

> 1. Go to [Oracle JDK 8 Download](https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html)
> 2. Download the latest stable version of Oracle JDK. For this project, I have used Oracle JDK 8(<b>jdk-8u271-windows-x64.exe</b>). Before downloading you have to first create your account on the site and then click on the favorable installer
> 3. On downloading the installer, extract if_ a zip file is downloaded
> 4. Double click on the installer and install the <b>jdk-8u261-windows-x64</b> jdk8
> 5. Accept the required permission(after you agree to them by going through the terms and conditions) and finish the process to successfully install the IDE



### Creating the Project from scratch

#### Brief introduction of the process
* Create a Dynamic web project
* Create a servlet
* Add servlet-api.jar file
* Write the servlet code
* Configure the server
* Run the servlet

#### Detailed steps to follow
1. Creating a Dynamic web project
```md
1.1 Open Eclipse
1.2 File --> New --> Dynamic Web Project
1.3 Enter project_name --> Chose target runtime(Apache Tomcat v9.0 or the version you installed) --> Next --> Next 
1.4 Check the checkbox of Generate web.xml deployment descriptor --> Finish
1.5 You will see the message - "Installing Dynamic Web Module Facet..." 
1.6 On completion you can see your project folder created under the "Project Explorer" view frame.
```

2. Creating a servlet in Eclipse
```md
2.1 Right click on the project name
2.2 Click on New --> Servlet
2.3 Enter the class name(say <b>Hello</b>) --> Next --> Next
2.4 Uncheck the methods that are not required and check the method names that you require in your project/java file --> Finish
2.5 <b>Hello.java</b> file will be created with the basic template. Now you can write your own code here. 
```

3. Adding servlet-api.jar file
```md
3.1 Right click on the project name
3.2 Click on Build Path --> Configure build path
3.3 Under the <b>Libraries</b> tab, click on <b>Add External JARs</b> present in the right columnar frame
3.4 Browse and open the Tomcat folder that you downloaded --> lib folder --> select servlet-api.jar file --> Open --> Apply and Close
3.5 The required servlet api file would be added 
```

4. Writing the servlet code in Eclipse
```md
4.1 Your program will still run with this basic template 
4.2 You can write your own code in the java file
4.3 For simplicity you can consider this code for ease of understanding
```
```java
 

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Hello() {}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		out.print("<html><body>");
		out.print("<h3>This line should get printed!</h3>");
		out.print("</body></html>");
	}

}

```
```md
4.4 Ctrl+S to save the code
```

5. Configuring the server
```md
5.1 Right click in the blank area under the server tab in the pane present below the code area.
5.2 Click on New --> Server
5.3 Select the server you installed(I chose Tomcat v9.0 Server) under the server type --> Next
5.4 Click on Add All --> Finish
5.5 The required server is configured and ready to host a program 
```


6. Running the servlet
```md
6.1 Right click on the project name
6.2 Select Run As --> 1 Run on Server
6.3 Select <b>Choose an existing server</b> --> select the Tomcat server under the localhost folder --> Next
6.4 Click on Add All --> Finish
6.5 You will encounter <b>HTTP Status 404 – Not Found</b>. Dont worry. It is because the local address is just accessing the folder and not the java file.
6.6 To solve this issue, typw the name of the file after the '/'. So at the end it will look like --> <b>http://localhost:8080/understanding/file_name</b>
6.7 Press Enter and you will be able to see the desired output...!
```


### Directly running this project

##### It is assumed that before running the project you have the already created the required local environment.
> 1. Download the zip file of this project from the <b>Code</b> button of the project
> 2. Extract the files
> 3. Open the Eclipse IDE
> 4. Go to File --> Import 
> 5. Open the dropdown of General folder --> Existing Projects into Workspace --> Next 
> 6. Browse and select the downloaded and extracted folder of this project --> Check the option "Copy projects into workspace" --> Finish
> 7. Your complete project would be ready to be deployed on the server.
> 8. Right click on the project and follow the above step #6

<!-- USAGE EXAMPLES -->
## Usage

Use this space to show useful examples of how a project can be used. Additional screenshots, code examples and demos work well in this space. You may also link to more resources.

_For more examples, please refer to the [Documentation](https://example.com)_



<!-- ROADMAP -->
## Roadmap

See the [open issues](https://github.com/othneildrew/Best-README-Template/issues) for a list of proposed features (and known issues).



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.



<!-- CONTACT -->
## Contact

Kush Shah - [Kaggle_Profile](https://www.kaggle.com/kushshah95) - [email](kushlinkedin@gmail.com)  

Project Link: [Java Servlet](https://github.com/shahkv95/JavaServlet)



<!-- ACKNOWLEDGEMENTS -->
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)
* [Animate.css](https://daneden.github.io/animate.css)
* [Loaders.css](https://connoratherton.com/loaders)
* [Slick Carousel](https://kenwheeler.github.io/slick)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)
* [Sticky Kit](http://leafo.net/sticky-kit)
* [JVectorMap](http://jvectormap.com)
* [Font Awesome](https://fontawesome.com)





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=flat-square
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=flat-square
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=flat-square
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=flat-square
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=flat-square
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=flat-square&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/kush-shah-5a771b169/
[product-screenshot]: images/click.png
