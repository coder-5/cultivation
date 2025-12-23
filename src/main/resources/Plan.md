# GAME DESIGN DOCUMENT: CULTIVATION SYSTEM MASTER REFERENCE

## 1. CORE GAMEPLAY STRUCTURE
The game is a Cultivation (Xianxia) RPG focused on progression through specific ranks and stages.

* **Hierarchy Levels:**
  * **6 Major Ranks:** Spanning from Qi Gathering to Immortality.
  * **4 Minor Stages:** Each Major Rank is split into Early, Middle, Late, and Peak.
  * **10 Substages:** Each Minor Stage contains ten substages (G0, G1, G2, G3, G4, G5, G6, G7, G8, G9).
* **Ascension:** To advance from G9 of one Minor Stage to G0 of the next, the player must pass a Heavenly Tribulation.

## 2. TALENT SYSTEM (SPIRIT ROOT)
A character's **Talent Score (T)** is randomly generated at launch (0 to 21) and determines both their potential ceiling and cultivation efficiency.

### 2.1 Talent Ceiling Mapping
The Talent Score dictates the maximum rank a character can naturally achieve:

| Talent Score | Maximum Attainable Rank         | Talent Score | Maximum Attainable Rank     |
|:-------------|:--------------------------------|:-------------|:----------------------------|
| **0**        | Mortal                          | **11**       | Core Formation Late         |
| **1**        | Qi Gathering Early              | **12**       | Core Formation Peak         |
| **2**        | Qi Gathering Middle             | **13**       | Nascent Soul Early          |
| **3**        | Qi Gathering Late               | **14**       | Nascent Soul Middle         |
| **4**        | Qi Gathering Peak               | **15**       | Nascent Soul Late           |
| **5**        | Foundation Establishment Early  | **16**       | Nascent Soul Peak           |
| **6**        | Foundation Establishment Middle | **17**       | Deity Transformation Early  |
| **7**        | Foundation Establishment Late   | **18**       | Deity Transformation Middle |
| **8**        | Foundation Establishment Peak   | **19**       | Deity Transformation Late   |
| **9**        | Core Formation Early            | **20**       | Deity Transformation Peak   |
| **10**       | Core Formation Middle           | **21**       | **Immortality**             |

### 2.2 Growth Formulas (The Heavens Math)
* **EXP Requirement:** `neededEXP = (1 + currentSubStageIndex) * (22 - Talent)`.
* **Cultivation Speed:** `gainPerTick = Random.nextFloat(0, (neededEXP / (22 - Talent)))`.

## 3. SECT SYSTEM
Players may join a sect for Contribution Points and Pill Discounts.

### 3.1 Sect Starting Skips (Based on Talent/Potential)
Characters with high talent can bypass lower sect ranks upon joining:
* **Talent 21:** Chosen Disciple (10% Discount).
* **Talent 17–20:** Core Disciple (8% Discount).
* **Talent 13–16:** Inner Disciple (6% Discount).
* **Talent 9–12:** Outer Disciple (4% Discount).
* **Talent 1–8:** Servant Disciple (2% Discount).
* **Talent 0:** Servant (0% Discount).

### 3.2 Full Sect Rank & Discount Table (Based on Actual Rank)
Progressing through cultivation ranks unlocks higher sect positions and discounts:

| Cultivation Rank      | Sect Rank              | Discount |
|:----------------------|:-----------------------|:--------:|
| Mortal                | Servant                |    0%    |
| Qi Gathering Early    | Prob. Servant Disciple |    1%    |
| Qi Gathering Middle   | Servant Disciple       |    2%    |
| Qi Gathering Late     | Prob. Outer Disciple   |    3%    |
| Qi Gathering Peak     | Outer Disciple         |    4%    |
| Found. Estab. Early   | Prob. Inner Disciple   |    5%    |
| Found. Estab. Middle  | Inner Disciple         |    6%    |
| Found. Estab. Late    | Prob. Core Disciple    |    7%    |
| Found. Estab. Peak    | Core Disciple          |    8%    |
| Core Formation Early  | Prob. Chosen Disciple  |    9%    |
| Core Formation Middle | Chosen Disciple        |   10%    |
| Core Formation Late   | Prob. Enforcer         |   11%    |
| Core Formation Peak   | Enforcer               |   12%    |
| Nascent Soul Early    | Prob. Minor Elder      |   13%    |
| Nascent Soul Middle   | Minor Elder            |   14%    |
| Nascent Soul Late     | Prob. Elder            |   15%    |
| Nascent Soul Peak     | Elder                  |   16%    |
| Deity Trans. Early    | Prob. Major Elder      |   17%    |
| Deity Trans. Middle   | Major Elder            |   18%    |
| Deity Trans. Late     | Prob. Grand Elder      |   19%    |
| Deity Trans. Peak     | Grand Elder            |   20%    |
| Immortality           | Ancestor               |   21%    |

4. COMBAT RANK SYSTEM
--------------------------------------------------------------------------------
Combat Rank is separate from Cultivation. 10 Major Stages, each with 4 sub-
stages (Lesser, Normal, Greater, Peak).

STAGES:
1. Martial Disciple   2. Martial Master      3. Martial Grandmaster
4. Martial Lord       5. Martial King        6. Martial Emperor
7. Martial Sovereign  8. Martial Spirit      9. Martial Ancestor
10. Martial Saint

It is independent of the cultivation rank and while exp needed to rank up formula is (1 + currentSubStageIndex) * 5
the exp gained formula is (opponentCombatSubstance / YourCombatSubstage)

5. ABOLISHMENT & REBIRTH MECHANIC
--------------------------------------------------------------------------------
When a player reaches the "Wall" (G9 of their Talent Ceiling rank):
- Requirement: Reach the maximum rank allowed by current Talent score.
- Choice: The player may choose to "Abolish Cultivation Base."
- Result:
  1. Talent Score (T) increases by +1.
  2. Cultivation Rank is reset to Mortal (G0).
  3. Combat Rank is changed to what it was before player started cultivating.
  4. Player may re-evaluate Sect Rank (allowing for skips with higher Talent).

6. INTRO SEQUENCE
--------------------------------------------------------------------------------
1. Explain Cultivation world and mechanics.
2. Roll Talent Score (0-21).
3. Display Talent Score and explain specific meaning (Ceiling and Potential).
4. Present an option to join a Sect.
================================================================================