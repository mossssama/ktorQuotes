package com.newOs.routes

import com.newOs.data.model.Quote
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


private val quotes = listOf(
    Quote("Abraham Lincoln","Whatever you are, be a good one"),
    Quote("Jean-Paul Sartre","Hell is other people"),
    Quote("Sir Francis Bacon","Knowledge is power"),
    Quote("Albert Einstein","Life is like riding a bicycle. To keep your balance, you must keep moving"),
    Quote("Walt Disney","If you can dream it, you can do it"),
    Quote("Vince Lombardi","Winners never quit and quitters never win"),
    Quote("Les Brown","The harder the battle, the sweeter the victory"),
    Quote("Theodore Roosevelt","Speak softly and carry a big stick"),
    Quote("Michael Jordan","There are no shortcuts in life"),
    Quote("Winston Churchill","The price of greatness is responsibility"),
    Quote("Hellen Keller","Life is either a daring adventure or nothing at all"),
    Quote("Confucius","Life is really simple, but we insist on making it complicated"),
    Quote("Thomes Edison","I failed my way to success"),
    Quote("Lady Gaga","I'm not here to be perfect, I'm here to be real"),
    Quote("Steve Jobs","Your time is limited, don't waste it living someone else's life"),
    Quote("Oprah Winfrey","The best way to find out what you want in life is to try a lot of things"),
    Quote("Lily Tomlin","The road to success is always under construction"),
    Quote("Stan Lee","I'm not a self-made man. I've had a lot of help"),
    Quote("Tony Robbins","You've got to be in it to win it"),
    Quote("Will Rogers","Don't let yesterday take up too much of today"),
    Quote("Nelson Mandela","The greatest glory in living lies not in never falling, but in rising every time we fall"),
    Quote("Oscar Wilde","Be yourself; everyone else is already taken"),
    Quote("Benjamin Franklin","Well done is better than well said"),
    Quote("Aristotle","It is during our darkest moments that we must focus to see the light"),
    Quote("Ralph Waldo Emerson","Life is a succession of lessons which must be lived to be understood"),
    Quote("Dalai Lama","The purpose of our lives is to be happy"),
    Quote("Mae West","You only live once, but if you do it right, once is enough"),
    Quote("John Wooden","Do not let making a living prevent you from making a life"),
    Quote("Hellen Keller","Life is either a daring adventure or nothing"),
    Quote("Ray Bradbury","Life is trying things to see if they work")
)

fun Route.randomQuote(){
    get("/randomQuote") {
        call.respond(
            HttpStatusCode.OK,
            quotes.random()
        )
    }
}