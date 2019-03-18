package com.rens.playerscore.repository

import com.rens.playerscore.model.Player
import org.springframework.data.repository.CrudRepository

interface PlayerRepository : CrudRepository<Player, String> {
    fun findTop3ByOrderByTotalScoreDesc() : List<Player>
}