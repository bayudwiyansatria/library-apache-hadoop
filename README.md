<p align="center">
<a href="https://bayudwiyansatria.github.io/Development-And-Operations/">
<img src="https://cdn.bayudwiyansatria.com/assets/logo-full.png" width="100%" />
</a>
<br>
</p>
<p align="center">
<a href="#">
<img src="https://img.shields.io/badge/%20Platforms-Java-blue.svg?style=flat-square" alt="Platforms" />
</a>
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/LICENSE">
<img src="https://img.shields.io/badge/%20Licence-MIT-green.svg?style=flat-square" alt="license" />
</a>
</p>
<p align="center">
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/CODE_OF_CONDUCT.md">
<img src="https://img.shields.io/badge/Community-Code%20of%20Conduct-orange.svg?style=flat-squre" alt="Code of Conduct" />
</a>
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/SUPPORT.md">
<img src="https://img.shields.io/badge/Community-Support-red.svg?style=flat-square" alt="Support" />
</a>
<a href="https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/CONTRIBUTING.md">
<img src="https://img.shields.io/badge/%20Community-Contribution-yellow.svg?style=flat-square" alt="Contribution" />
</a>
</p>
<hr>

# Bayu Dwiyan Satria - Apache Hadoop Libraries

[![Contributor Covenant](https://img.shields.io/badge/Contributor%20Covenant-v1.4%20adopted-ff69b4.svg)](CODE_OF_CONDUCT.md)

![Github Actions](https://github.com/bayudwiyansatria/Library-Apache-Hadoop/workflows/Github%20Action/badge.svg)
[![Build Status](https://dev.azure.com/bayudwiyansatria/Bayu%20Dwiyan%20Satria%20-%20Programming%20Library/_apis/build/status/Library-Apache-Hadoop?branchName=master)](https://dev.azure.com/bayudwiyansatria/Bayu%20Dwiyan%20Satria%20-%20Programming%20Library/_build/latest?definitionId=20&branchName=master)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/f2834a4963354432a9b5aec6a540c1b6)](https://www.codacy.com/manual/bayudwiyansatria/Library-Apache-Hadoop?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=bayudwiyansatria/Library-Apache-Hadoop&amp;utm_campaign=Badge_Grade)

Apache Hadoop is a collection of open-source software utilities that facilitate using a network of many computers to solve problems involving massive amounts of data and computation. It provides a software framework for distributed storage and processing of big data using the MapReduce programming model. Originally designed for computer clusters built from commodity hardware—still the common use—it has also found use on clusters of higher-end hardware. All the modules in Hadoop are designed with a fundamental assumption that hardware failures are common occurrences and should be automatically handled by the framework.

|   Key     |   Description |
|   ------  |   ------      |
| Name      |   Bayu Dwiyan Satria - Apache Hadoop Libraries   |
| Description | Bayu Dwiyan Satria For Apache Hadoop Environment. |
| Site | [Site Page](https://bayudwiyansatria.github.io/Library-Apache-Hadoop) |

## Table of Contents

* [Dependencies](#dependencies)
* [Installation](#installation)
* [Development](#development)
* [Contributing](#contributing)
* [License](#license)

## Dependencies

For more information see : [The Central Repository](https://search.maven.org/artifact/com.bayudwiyansatria/apache-hadoop/).

**Maven Central :**

|  Name     |   Group   | Artifact  | Version   |
| -----     |   -----   | -----     | -----     |
| [JUnit](https://search.maven.org/artifact/junit/junit)                            | junit                     | junit                         | 4.12
| [SLF4j](https://search.maven.org/)                                                | org.slf4j                 | slf4j-simple                  | 1.7.25
| [SLF4j](https://search.maven.org/)                                                | org.slf4j                 | slf4j-api                     | 1.7.25
| [Ham Crest](https://search.maven.org/)                                            | org.hamcrest              | hamcrest-core                 | 1.3
| [Ham Crest](https://search.maven.org/)                                            | org.hamcrest              | hamcrest-library              | 1.3
| [Bayu Dwiyan Satria](https://search.maven.org/artifact/com.bayudwiyansatria/core) | com.bayudwiyansatria      | core                          | 1.1.8
| [Log4j](https://search.maven.org/)                                                | org.apache.logging.log4j  | log4j-api                     | 2.11.12
| [Apache Hadoop](https://search.maven.org/)                                        | org.apache.hadoop         | hadoop-client                 | 2.6.5
| [Apache Hadoop](https://search.maven.org/)                                        | org.apache.hadoop         | hadoop-hdfs                   | 2.6.5
| [Apache Hadoop](https://search.maven.org/)                                        | org.apache.hadoop         | hadoop-yarn-server-nodemanager| 2.6.5

## Installation

Install the dependencies :

**Maven** :

Configure the following dependency in the pom file:

```xml
<dependency>
  <groupId>com.bayudwiyansatria</groupId>
  <artifactId>apache-hadoop</artifactId>
  <version>${bayudwiyansatria.apache-hadoop.version}</version>
</dependency>
```

**Gradle** :

Configure the following dependency in the build.gradle file:

```properties
implementation='com.bayudwiyansatria:apache-hadoop:${bayudwiyansatria.apache-hadoop.version}'
```

SBT

```sbt
libraryDependencies += "com.bayudwiyansatria" % "apache-hadoop" % "${bayudwiyansatria.apache-hadoop.version}"
```

**Important** ! This will update from to your local repository . Be sure to swap out `${bayudwiyansatria.apache-hadoop.version}` with the actual version of hadoop Libraries.

For more information see : [The Central Repository](https://search.maven.org/artifact/com.bayudwiyansatria/apache-hadoop/).

## Development

-*Release 1.0* : **2019, Sept**.

-*Release 1.1* : **2019, Nov**.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

Looking to contribute to our code but need some help? There's a few ways to get information:

* Connect with us on [Twitter](https://twitter.com/bayudsatria)
* Like us on [Facebook](https://facebook.com/PBayuDSatria)
* Follow us on [LinkedIn](https://linkedin.com/in/bayudwiyansatria)
* Subscribe us on [Youtube](https://youtube.com/channel/UCihxWj1rtheK73mGdrf0OiA)
* Log an issue here on github

## License

[MIT](https://github.com/bayudwiyansatria/Development-And-Operations/blob/master/LICENSE) | [BAYU DWIYAN SATRIA](https://www.bayudwiyansatria.com)

<p> Copyright &copy; 2017 - 2019 Bayu Dwiyan Satria. All Rights Reserved.
