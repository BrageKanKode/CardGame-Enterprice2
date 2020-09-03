package enterprise2.cardgame.usercollections.dto

import io.swagger.annotations.ApiModelProperty

class PatchResultDto (
        @get:ApiModelProperty("If a card pack was opened, specify which cards were in it")
        var cardIdInOpenedPacket: MutableList<String> = mutableListOf()
)