package enterpris2.cardgame.usercollections.model

import enterprise2.cardgame.cards.dto.CardDto
import enterprise2.cardgame.cards.dto.Rarity

data class Card(
        val cardId : String,
        val rarity: Rarity
){

    constructor(dto: CardDto): this(
            dto.cardId ?: throw IllegalArgumentException("Null cardId"),
            dto.rarity ?: throw IllegalArgumentException("Null rarity"))
}