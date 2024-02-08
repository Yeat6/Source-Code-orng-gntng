package com.broknppl.miniproject

object DataSongs {

    private val name = arrayOf(
        "Do I Wanna Know?",
        "R U Mine?",
        "One For The Road",
        "Arabella",
        "I Want It All",
        "No. 1 Party Anthem",
        "Mad Sounds",
        "Fireside",
        "Why'd You Only Call Me When You're High",
        "Snap Out Of It",
        "Knee Socks",
        "I Wanna Be Yours"
    )

    private val description = arrayOf(
        "“Do I Wanna Know” is the second single from AM, premiered live at the Ventura Theatre, CA on May 22, 2013.In it, Alex portrays himself as an obsessive lover that is paranoid about the state of his relationship.",
        "A single from Arctic Monkeys originally released in early 2012 for Record Store Day in the UK. “R U Mine?” was then re-recorded for their 2013 album AM.The song delves into the relationship between casual flirtation and addictive lust, with Alex describing himself as just a “puppet” for her, completely under her control and compulsively begging for her affection.",
        "Fourth AM’s single, “One for the Road,” shows Alex Turner leaving a girl and the title refers to a final drink before leaving home to fortify one for the journey ahead. The expression and practice has fallen victim to the increasing enforcement of drink-driving over the past few decades.",
        "A song about a space aged lover named Arabella serves as track four on the Arctic Monkeys' 5th album AM. It furthers the album’s motif of passion’s incessant pull, both for better and worse, with the titular woman’s unavoidable appeal.",
        "In a typical rock star mentality, Alex wants every lovely encounter with a beautiful woman to keep on. He’s just so damn eloquent about it all.",
        "Ironically, the slowest track off of AM, “No. 1 Party Anthem,” pokes fun at waiting for an anthemic party song to feel the vibe. Some of the lyrics here were first used on Arctic Monkeys greatest hit, “Do I Wanna Know?,”",
        "The only song from AM not released as a single to be debuted live before the release of the album.Another slow-tempo song, continuing on from Track 6 “No. 1 Party Anthem”, that ponders the value and healing properties of music.",
        "A beautiful song about how difficult it is to move on from someone you loved, even when you know it’s the right thing to do.",
        "A single off the Arctic Monkeys 5th album AM, “Why’d You Only Call Me When You’re High?” is a sexy record, that has the band experimenting with R&B sounds.",
        "“Snap Out of It,” one of the poppiest and most instantly accessible songs on the record, describes Alex Turner trying to tell a girl that she should forget about him.",
        "Perhaps the album’s best song is tucked away just before it ends. Everything about this track is sexy…from the bass drum and simple guitar riff as it opens, to the imagery conjured up by a line like “When you walked around your house wearing my sky blue Lacoste… And your knee socks\". And we’re bouncing as the images in Alex’s head come together in a parting crescendo.",
        "The song reworks John Cooper Clarke’s poem of the same name. The song focuses on similar themes in the poem.The beat is strongly reminiscent of “Spanish Sahara.”.Reworking a poem into a song is extremely difficult and as John Cooper Clarke put it Alex has changed a semi-comedic poem into a full-on love song."
    )

    private val lirik = arrayOf(
        ""
    )

    private val image = intArrayOf(
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea,
        R.drawable.aea

    )

    val listsongs : ArrayList<Songs>
        get(){
            val list = arrayListOf<Songs>()
            for (posisiton in name.indices){
                val song = Songs()
                song.name = name[posisiton]
                song.description = description[posisiton]
                song.image = image[posisiton]
                list.add(song)

            }
            return list
        }

}