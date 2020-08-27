package com.hillary.quotess;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.concurrent.ThreadLocalRandom;

public class Quote {
    String[] getQuoteList(){

        String[] quotes=new String[]{
                "\"Life is what we make it, always has been, always will be.\" - Grandma Moses",
                "\"Every moment is a fresh beginning.\" - T.s. Eliot",
                "\"They call it a Royale with cheese.\" - Pulp Fiction",
                "\"Magic Mirror on the wall, who is the fairest one of all?\" - Snow White and the Seven Dwarves",
                "\"Just when I thought I was out, they pull me back in.\" - The Godfather: Part III",
                "\"I don't want to survive. I want to live.\" - 12 Years a Slave",
                "\"Help me, Obi-Wan Kenobi. You're my only hope.\" - Star Wars Episode IV: A New Hope",
                "\"Hasta la vista, baby.\" - Terminator 2: Judgment Day",
                "\"I'm having an old friend for dinner.\" - The Silence of the Lambs",
                "\"Just keep swimming.\" - Finding Nemo",
                "\"I'm the king of the world!\" - Titanic",
                "\"Shaken, not stirred.\" - Goldfinger",
                "\"Keep your friends close, but your enemies closer.\" - The Godfather: Part II",
                "\"The greatest trick the devil ever pulled was convincing the world he didn't exist.\" - The Usual Suspects",
                "\"Roads? Where we're going we don't need roads.\" - Back to the Future",
                "\"The greatest pleasure of life is love\" - Euripides",
                "\"Life is a flower of which love is the honey.\" - Victor Hugo",
                "\"Keep calm and carry on.\" - Winston Churchill",
                "\"Turn your wounds into wisdom.\" — Oprah Winfrey",
                "\"To infinity and beyond!\" - Toy Story",
                "\"The unexamined life is not worth living.\" — Socrates",
                "\"Why so serious?\" - The Dark Knight",
                "\"You only live once, but if you do it right, once is enough.\" — Mae West",
                "\"Get busy living or get busy dying.\" — Stephen Kings",
                "\"The purpose of our lives is to be happy.\" — Dalai Lama"
        };
        return quotes;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    String getRandomQuotes(){
        String quote;
        int quotesArrayLen = getQuoteList().length;
        int randomNum = ThreadLocalRandom.current().nextInt(quotesArrayLen);
        quote = getQuoteList()[randomNum];
        return quote;
    }
}
