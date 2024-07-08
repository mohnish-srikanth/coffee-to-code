FROM node:alpine
COPY  package.json /app/
COPY src /app/
WORKDIR /app
# CMD node app.js
RUN npm install
CMD node server.js