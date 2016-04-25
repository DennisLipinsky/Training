package com.javarush.test.level13.lesson11.Solution09;

/**
 *
 */
public final class BodyPart {

    private String bodyPart;

    final static BodyPart LEG = new BodyPart("нога");
    final static BodyPart HEAD = new BodyPart("голова");
    final static BodyPart ARM = new BodyPart("рука");
    final static BodyPart BODY = new BodyPart("грудь");



    private BodyPart(String bodyPart)
    {
        this.bodyPart = bodyPart;
    }

    @Override
    public String toString()
    {
        return this.bodyPart;
    }
}

