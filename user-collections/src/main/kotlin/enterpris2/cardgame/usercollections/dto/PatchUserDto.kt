package enterpris2.cardgame.usercollections.dto

import io.swagger.annotations.ApiModelProperty

enum class Command {
    OPEN_PACK,
    MILL_CARD,
    BUY_CARD
}

data class PatchUserDto(

        @get:ApiModelProperty("Command to execute on a user's collection")
        var command: Command? = null,

        @get:ApiModelProperty("Optional card id, if the command requires one")
        var cardId: String? = null
)