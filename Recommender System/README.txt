CS535-Introduction to Data Mining
Spring 2018
Author: Abhisek Dinkar Raut 
B-Number: B00718042
email Id: araut1@binghamton.edu


ABOUT:

  Project implements collaborative filtering. Item-based collaborative filtering is a model-based algorithm for making recommendations. 
  In the project algorithm, the similarities between different items present in the dataset are calculated by using one of a number of 
  similarity measures, and then these similarity values are used to predict ratings for user-item pairs not present in the dataset.


FILES:

  In this project there are 9 files:

  dm_project.java -> contains main method, entry point class
  Initializer.java -> the file associated with required data structutes initializing
  ModelBuilder.java -> the file associated with model development and missing values prediction
  FileProcessorInterface.java -> the file associated interface for file operations
  FileProcessor.java -> the file associated file operations
  build.xml -> the make file which is associated with cleaning, compiling and running the code
  train_all_txt.txt -> the associated input file
  output.txt -> desired output file (will be under same directory as README file)
  README.txt -> information like running, compilng etc.


ENVIRONMENT:

  The code is tested on remote.cs.binghamton.edu. Coded with IntelliJ IDEA 2018.1.1 x64 platform.


OUTPUT:

  Total time is 17838 ms


COMPILE:

  Suppose that you are under the directory which has this README file. 
  To COMPILE the code do the following in Linux command line:
  
  >   ant -buildfile build.xml all


RUN:

  Suppose that you are under the directory which has this README file. 
  To RUN the code do the following in Linux command line:
  
  >  ant -buildfile build.xml run -Darg0=train_all_txt.txt -Darg1=output.txt


CLEAN:

  Suppose that you are under the directory which has this README file. 
  To remove the executable do the following in Linux command line:
  
  >  ant -buildfile build.xml clean


REFERENCE:

  http://www.cs.carleton.edu/cs_comps/0607/recommend/recommender/itembased.html


ASSUMPTION:

  Apache Ant(TM) version 1.9.9 and Java Runtime Environment(JRE™) installed on all department machine.
