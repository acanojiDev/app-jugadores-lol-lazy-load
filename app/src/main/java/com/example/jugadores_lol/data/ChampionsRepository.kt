package com.example.jugadores_lol.data

/*
* REPOSITORY
*
* Es el lugar donde obtenemos los datos
*
* ¿Porque usar un Repository?
* - Separa los datos de la UI
* - Facilita cambiar la fuente de datos despues
* - Hace el codigo mas ordenado y profesional
*
* 'object' = Singleton (solo existe UNA instancia en toda la app)
* */


object ChampionsRepository {
    /**
     * Devuelve la lista de campeones
     *
     * Por ahora son datos "hardcodeados" (escritos directamente),
     * pero más adelante podriamos obtenerlos de una API real
     */

    /*
     TIPS: 1. listof() crea una lista inmutable (no se puede modificar)
           2. Si quisieras una lista modificable usariamos mutableListOf()
           3. Las URLs vienen de la misma pagina oficial de LOL

        Evolución futura:
        Cambiar:
        - Obtener datos de una API con Retrofit
        - Guardar en Room (base de datos local)
        - Usar ViewModel para gestionar el estado
     */

    fun getChampions(): List<Champion>{
        return listOf(
            Champion(
                name = "Annie",
                description = "La Hija de la Oscuridad",
                imageUrl = "https://static.wikia.nocookie.net/leagueoflegends/images/a/ab/Aspecto_centrado_-_Annie_Base.jpg/revision/latest/scale-to-width-down/1100?cb=20231113030435&path-prefix=es"
            ),
            Champion(
                name  = "Diana",
                description = "El Desdén de la Luna",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/f7ad13d4cc98803ddfcf53c008a1a102b8e0f1a7-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Fizz",
                description = "El Gamberro de las Mareas",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/d62b56e6f606e6e225a59879be46e0903a973dd0-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Irelia",
                description = "La Danza de las Cuchillas",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/baa25073a0560dbfffa5fafa9eeebe3bd27c4206-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Leona",
                description = "El Amanecer Radiante",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/ca5514aba585f54d0f193189d5be105a3b2bc510-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Mordekaiser",
                description = "La Pesadilla de Hierro",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/1b94f6681d951a6618b4c2db1cc93825af1422eb-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Neeko",
                description = "La Camaleona Curiosa",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/19bcf3f8a2ef5006235be5b9c35931f323a03620-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Senna",
                description = "La Redentora",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/719125ca9f21739ccb8d1a1fae91d7c943fe79dc-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Taric",
                description = "El Escudo de Valoran",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/bb1089300ccc01a26cfaeb516f139344971827fa-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Teemo",
                description = "El Explorador Veloz",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data/64438d63b60f942297a010bf34ac30c2162ce98b-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Vi",
                description = "La Agente de Piltover",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/1d86e26e1b6ec9840b60d9386ae330d6eceacbf0-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Ziggs",
                description = "El Experto en Hexplosivos",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/78698b396af1dad5be4a076d1272025032b954f4-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Aatrox",
                description = "La Espada de los Oscuros",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data/db39563458aa28c3f3aa8990f2c964a0f7645097-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Ahri",
                description = "La Mujer Zorro de nueve Colas",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/55e7e901b1f69d72804665cfbeb1f4f59c8fa877-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name="Akali",
                description = "La Asesina Sigilosa",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/abbd173df157f943496abb0638add119f753e3b2-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Akshan",
                description = "El Centinela Rebelde",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/9e5ea58123ac5a699700eec49f8412af11e563a0-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Alistar",
                description = "El Minotauro",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/da8cefee5b85bca51360ccc1635ef5b0f6967767-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Ambessa",
                description = "Matriarca de la Guerra",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data/1b20e5e8cea542296a62b09dd4a67e81570ce80c-496x560.png?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Amumu",
                description = "La Momia Triste",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/092febba8905cff35940d036fd20b7e3ad4f428f-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Anivia",
                description = "La Criofénix",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/b9081057a6282c7c7f074dc9cec094b8d51df9bf-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Aphelios",
                description = "El Arma de los Fieles",
                imageUrl = "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aphelios_0.jpg"
            ),
            Champion(
                name = "Ashe",
                description = "La Arquera de Hielo",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/6311d8de67f55496be4886a353372c8da713dade-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Aurelion Sol",
                description = "El Forjador de Estrellas",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/b665be2e2ae732b20295424957c5e1dccdf07098-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Aurora",
                description = "La Bruja entre Mundos",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/b665be2e2ae732b20295424957c5e1dccdf07098-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Azir",
                description = "El Emperador de las Arenas",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/1636aeb5f8d604f7d3336428918146cac62c28e7-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Bardo",
                description = "El Guardián Errante",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/9679cce427dbc633348fc330806543a3ff2509a9-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Bel´veth",
                description = "La Emperatriz del Vacío",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/63cbd4e3da7484ffde0130784bcc879b50652f53-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Blitzcrank",
                description = "El Gran Gólem de Vapor",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/c6db939c90bf8e10b1b9baf77bc99c9bcd2d6981-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Brand",
                description = "La Venganza Ardiente",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/6dd885169af0eeb3d662923df8a87973ee13844f-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Braum",
                description = "El Corazón de Freljord",
                imageUrl = ""
            ),
            Champion(
                name = "Briar",
                description = "La Gula Confinada",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/8828f92a1ed9c410b5be0a5424f95b3a8f641e5a-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Caitlyn",
                description = "La Sheriff de Piltover",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/33eb2887813cb07d3b708800b93097a02182e98b-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Camille",
                description = "La Sombra de Acero",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data/78114603ab0495a965c63da0b1d8d9b1cdced67c-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Cassiopeia",
                description = "El Abrazo de la Serpiente",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/e6193f3ac760c4cf27a99c4adc0c116339c12c5a-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Cho´gath",
                description = "El Terror del Vacío",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/6b0fe9a40e625b72d4b97ee108a221abc7aa24fb-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Corki",
                description = "El Bombardero Osado",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/a01abe18e557c86721e8725ac36337a8839ac926-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Darius",
                description = "La Mano de Noxus",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/f606418621ccec569ab1ec87e1084dfd8e45e5f1-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Dr.mundo",
                description = "El Loco de Zaun",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/3da8fcf480e236197eefa038f6f91a8e6ea6a451-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Draven",
                description = "El Ejecutor Glorioso",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/374ea4cb505b1288172fd93d92064af5b7cbc298-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Ekko",
                description = "El Chico que Quebró el Tiempo",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/f46b8d63d3ed969469ab6c3d3e5827a70a6e826a-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Elise",
                description = "La Reina de las Arañas",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/9d7c852f03f09bd32aab843a98f3a4c371afa3ba-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Evelyn",
                description = "El Abrazo Agónico",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/e5cf98936e8b47a7909248518d7737dd610a137b-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Ezreal",
                description = "El Explorador Pródigo",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/ecec8b919f053c1dd99602a06abe9b709ce14d5a-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Fiddlesticks",
                description = "El Terror Ancestral",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data/4f49d9cf3f13075a79b25dbeb5657fb59742a4f1-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Fiora",
                description = "El Terror Ancestral",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data/4f49d9cf3f13075a79b25dbeb5657fb59742a4f1-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Galio",
                description = "El Coloso",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/28f2a8ca2e4422674275c5e2d077d6cb4f143d0c-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Gangplank",
                description = "El Azote de los Mares",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/9cb7c305070bc7ae1885483695d5272f85ee0c59-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Garen",
                description = "El Poder de Demacia",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/2acb7715797d4183b09fdbfb902ff52a0aa4e0cf-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Gnar",
                description = "El Eslabón Perdido",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/5c0a5cedf2e21d887e83674d1c09099633e3cb4e-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Gracas",
                description = "El Camorrista",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/804047489514e31ac95e7d74878a167327021f99-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Graves",
                description = "El Forajido",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/b82361d8b1b9a7788dce0c4604cad844bb68a095-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Gwen",
                description = "La Costurera Consagrada",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/dde9ede0cd3013a28dc29b98d25caf3e4b79348f-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),
            Champion(
                name = "Hecarim",
                description = "La Sombra de la Guerra",
                imageUrl = "https://cmsassets.rgpub.io/sanity/images/dsfx7636/game_data_live/1be0f0e944bc9be2c15ebc782a3f69ea9e754499-496x560.jpg?auto=format&fit=fill&q=80&w=352"
            ),

        )
    }
}