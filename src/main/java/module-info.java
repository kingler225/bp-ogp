module bp.ogp {
    requires hanyaeger;

    exports nl.han.goran.inger.bp;

    opens background;
    opens background.layered;
    opens music.exports;
    opens fonts;
    opens player.sprites;
}