package com.chandan.quotes;

import java.util.concurrent.ThreadLocalRandom;

public class QuotesServer {
    String[] getQuotes() {

        String[] quotes = new String[]{"I remember, when 9/11 went down, my reaction was, \"\"Well, I've had it with humanity.\"\"",
                "“The most painful thing is losing yourself in the process of loving someone too much, and forgetting that you are special too.” ― Ernest Hemingway",
                "\"A society grows great when old men plant trees whose shade they know they shall never sit in.\" - Greek proverb",
                "\"How lucky am I to have something that makes saying goodbye hard\" Winnie the Pooh",
                "\"When you're 20 you care what everyone thinks, when you're 40 you stop caring what everyone thinks, when you're 60 you realize no one was ever thinking about you in the first place\" -Unknown",
                "“I'm not upset that you lied to me, I'm upset that from now on I can't believe you” - Friedrich Nietzsche",
                "“You can tell how smart people are by what they laugh at.” - Tina Fey",
                "\"The biggest coward is a man who awakens a woman’s love with no intention of loving her.\" -Bob Marley",
                "\"Sometimes you will never know the value of a moment until it becomes a memory\" - Dr. Seuss",
                "\"Everyone you will ever meet knows something you don't.\" - Bill Nye",
                "\"If you want more ice cream, use a smaller spoon.\" - My Grandma",
                "\t\"It is easier to build strong children than to repair broken men.\" - Frederick Douglass",
                "“You will not be punished for your anger, you will be punished by your anger.” - Buddha",
                "\"Only put off until tomorrow what you are willing to die having left undone.\" Pablo Picasso",
                "sometimes people forget that money is a tool not a goal\" - My Mom",
                "\"Why spend a dollar on a bookmark? ... Why not use the dollar as a bookmark?\" -Steven Spielberg",
                "\t'When the axe came into the woods, many of the trees said,\"At least the handle is one of us.\"' - Proverb",
                "''We met for a reason, either you're a blessing or a lesson.'' Frank Ocean",
                "\"Don't let school interfere with your education\" -Mark Twain",
                "\"Humility is not thinking less of yourself, it's thinking of yourself less\" - CS Lewis",
                "\"Those who do not move, do not notice their chains.\" - Rosa Luxemburg",
                "\"Why do you weep? Did you think I was immortal?\"― Louis XIV (last words)",
                "\"Do not complain about growing old. It is a privilege denied to many.\" - Mark Twain -",
                "“Chop your own wood, and it will warm you twice.” - Henry Ford",
                "\"Inside every cynical person, there is a disappointed idealist,\" -George Carlin",
                "\"Those who are heartless once cared too much\" - unknown",
                "\"I am patient with stupidity but not with those who are proud of it.\" Edith Sitwell",
                "\"Struggle ends where gratitude begins. \" Tim Ferriss"




        };

        return quotes;
    }


    String getRandomQuote() {

        String quote;

        int quotesArrayLen = getQuotes().length;

        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);

        quote = getQuotes()[randomNum];

        return quote;

    }
}
