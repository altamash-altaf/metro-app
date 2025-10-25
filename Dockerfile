# STEP 1: Use a reliable base image with the Java Development Kit (JDK) installed.
# We use an 'alpine' image for a smaller final image size.
FROM eclipse-temurin:17-jdk

# STEP 2: Set the working directory inside the container.
WORKDIR /app

# STEP 3: Copy all the source files into the container's working directory.
COPY heap.java .
COPY graph.java .
COPY metroMapCreator.java .
COPY MetroApp.java .

# STEP 4: Compile all Java source files.
# The compiler (javac) needs all files to resolve dependencies.
RUN javac heap.java graph.java metroMapCreator.java MetroApp.java

# STEP 5: Define the command to run the application when the container starts.
# We execute the class that contains the main method (MetroApp).
CMD ["java", "MetroApp"]
