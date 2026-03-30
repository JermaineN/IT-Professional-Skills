# 🐍 Snakes and Ladders

A two-player command-line Snakes and Ladders game built in Java.

> **Author:** Jermaine Ntoko  (G00432103)

---

## Usage / Examples

### Running the Game

Compile and run the program from your terminal:

```bash
javac snakesAndLaddersProject.java
java snakesAndLaddersProject
```

### Gameplay

1. The game starts by displaying a 10×10 board numbered 1–100.
2. Players take turns. On your turn, type `Roll` or `R` and press Enter to roll the dice:

```
Type 'Roll' or 'R' to roll the die: R
The number rolled was: 4
You are on number: 5
```

3. After each roll, the updated board is displayed with player positions marked:
   - `-1` → Player 1
   - `-2` → Player 2
   - `-3` → Both players on the same square

4. The game announces who is in the lead after each full turn.

### Snakes & Ladders

Landing on certain squares triggers special events:

**Snakes** (slide down 😬)

| Land on | Move to |
|---------|---------|
| 99      | 54      |
| 88      | 66      |
| 52      | 36      |
| 50      | 13      |
| 22      | 9       |

**Ladders** (climb up 🎉)

| Land on | Move to |
|---------|---------|
| 8       | 14      |
| 12      | 74      |
| 37      | 59      |
| 29      | 50      |
| 61      | 92      |

When a snake or ladder is triggered, the game prints a message and your new position automatically.

### Winning

The first player to reach **square 100** wins:

```
Player 1 Wins!!!
```

---

## Requirements

- Java 8 or higher
- Command-line terminal
