package enterpris2.cardgame.usercollections.dto

import io.swagger.annotations.ApiModelProperty

//test

class UserDto (
        @get:ApiModelProperty("Id of the user")
        var userId: String? = null,

        @get:ApiModelProperty("The amount of coins owned by the user")
        var coins: Int? = null,

        @get:ApiModelProperty("The number of un-opened card packs the user owns")
        var cardPacks: Int? = null,

        @get:ApiModelProperty("List of cards owned by the host")
        var ownedCards: MutableList<CardCopyDto> = mutableListOf()
)