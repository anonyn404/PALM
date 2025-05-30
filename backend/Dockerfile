# Use Ubuntu as the base image
FROM ubuntu:22.04

# Set the working directory
WORKDIR /app

# Update package lists and install required dependencies
RUN apt update && apt install -y \
    curl \
    gnupg2 \
    unzip \
    zip \
    openjdk-11-jdk \
    python3 \
    python3-pip

# Install SDKMAN (for managing SBT and Java tools)
RUN curl -s "https://get.sdkman.io" | bash

# Set up environment variables for SDKMAN
ENV SDKMAN_DIR=/root/.sdkman
ENV PATH="$SDKMAN_DIR/bin:$PATH"

# Install SBT via SDKMAN and ensure it persists
RUN bash -c "source $SDKMAN_DIR/bin/sdkman-init.sh && sdk install sbt"

# Ensure SDKMAN is sourced for all future shells (login & non-login shells)
RUN echo "source $SDKMAN_DIR/bin/sdkman-init.sh" >> /root/.bashrc \
    && echo "source $SDKMAN_DIR/bin/sdkman-init.sh" >> /root/.profile

# Copy the requirements file and install Python dependencies
COPY requirements.txt .
RUN pip3 install --no-cache-dir -r requirements.txt

# Copy the rest of the application code
COPY . .

# Expose the port Flask runs on
EXPOSE 5001

# Set environment variables
ENV FLASK_APP=app.py
ENV FLASK_RUN_HOST=0.0.0.0
ENV FLASK_ENV=development

# Ensure Bash is always used as the shell (needed for SDKMAN)
SHELL ["/bin/bash", "-c"]

# Run the application
CMD ["bash", "-c", "source /root/.sdkman/bin/sdkman-init.sh && python3 app.py"]