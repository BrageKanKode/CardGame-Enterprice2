package enterpris2.cardgame.usercollections

import enterpris2.cardgame.usercollections.db.CardCopy
import enterpris2.cardgame.usercollections.db.User
import enterpris2.cardgame.usercollections.dto.CardCopyDto
import enterpris2.cardgame.usercollections.dto.UserDto

object DtoConverter {

    fun transform(user: User) : UserDto {
        return UserDto().apply {
            userId = user.userId
            coins = user.coins
            cardPacks = user.cardPacks
            ownedCards = user.ownedCards.map { transform(it) }.toMutableList()
        }
    }

    fun transform(cardCopy: CardCopy) : CardCopyDto {
        return CardCopyDto().apply {
            cardId = cardCopy.cardId
            numberOfCopies = cardCopy.numberOfCopies
        }
    }
}