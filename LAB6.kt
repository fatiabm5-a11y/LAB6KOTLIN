fun main() {
    val p1 = Player("Nicola", "Tesla")
    val p2 = Player("Thomas", "Edison")

    val scoring = Scores()
    var lvlScore = 0

    // --- Scores de p1 : 20, 35, 25 ---
    lvlScore = 20
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.updateBest(p1.personalBestScore, lvlScore)

    lvlScore = 35
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.updateBest(p1.personalBestScore, lvlScore)

    lvlScore = 25
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.updateBest(p1.personalBestScore, lvlScore)

    // --- Scores de p2 : 15, 30, 10 (modifiable) ---
    lvlScore = 15
    p2.totalScore += lvlScore
    p2.personalBestScore = scoring.updateBest(p2.personalBestScore, lvlScore)

    lvlScore = 30
    p2.totalScore += lvlScore
    p2.personalBestScore = scoring.updateBest(p2.personalBestScore, lvlScore)

    lvlScore = 10
    p2.totalScore += lvlScore
    p2.personalBestScore = scoring.updateBest(p2.personalBestScore, lvlScore)

    // --- Déterminer le gagnant ---
    val winner: Player
    if (p1.totalScore >= p2.totalScore) {
        winner = p1
    } else {
        winner = p2
    }

    println("Winner " + winner.fullName() + " with a combined score of " + winner.totalScore)
    println("Personal Best Score is = " + winner.personalBestScore)
}