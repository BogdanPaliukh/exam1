FROM openjdk:11

RUN mkdir /dockerexam

COPY src/ /dockerexam

WORKDIR /dockerexam

CMD java QuizApplication.java

