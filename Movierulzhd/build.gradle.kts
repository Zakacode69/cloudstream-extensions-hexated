// use an integer for version numbers
version = 23


cloudstream {
    language = "hi"
    // All of these properties are optional, you can safely remove them

//     description = "Movierulzhd recently have prank feature that the enable and disable cloudflare a "
     authors = listOf("Hexated")

    /**
     * Status int as the following:
     * 0: Down
     * 1: Ok
     * 2: Slow
     * 3: Beta only
     * */
    status = 1 // will be 3 if unspecified
    tvTypes = listOf(
        "TvSeries",
        "Movie",
    )

    iconUrl = "https://www.google.com/s2/favicons?domain=movierulzhd.run&sz=%size%"
}
