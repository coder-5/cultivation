# GAME DESIGN DOCUMENT: CULTIVATION SYSTEM MASTER REFERENCE


1. CORE GAMEPLAY STRUCTURE
--------------------------------------------------------------------------------
Game Genre: Cultivation (Xianxia) / RPG
Progression Units:
- 6 Major Ranks: From Qi Gathering to Immortality.
- 4 Minor Stages: Each Major Rank is split into Early, Middle, Late, and Peak.
- 10 Substages: Each Minor Stage is split into G0, G1, G2, G3, G4, G5, G6, G7, G8, G9.
- Ascension: To move from G9 to the next Minor Stage G0, a player must pass a
  Heavenly Tribulation.

2. TALENT SYSTEM (Scale: 0 to 21)
--------------------------------------------------------------------------------
Talent (T) is randomly generated at launch and determines the character's
potential ceiling and cultivation efficiency.

FORMULA: EXP Requirement
- neededEXPToReachNextSubStage = (1 + currentSubStageIndex) * (22 - talent)

FORMULA: Cultivation Speed
- gainPerTick = Random.nextFloat(0, (neededEXPToReachNextSubStage / (22 - talent)))

TALENT CEILING MAPPING:
| Talent | Maximum Attainable Rank           |
|--------|-----------------------------------|
| 0      | Mortal                            |
| 1      | Qi Gathering Early                |
| 2      | Qi Gathering Middle               |
| 3      | Qi Gathering Late                 |
| 4      | Qi Gathering Peak                 |
| 5      | Foundation Establishment Early    |
| 6      | Foundation Establishment Middle   |
| 7      | Foundation Establishment Late     |
| 8      | Foundation Establishment Peak     |
| 9      | Core Formation Early              |
| 10     | Core Formation Middle             |
| 11     | Core Formation Late               |
| 12     | Core Formation Peak               |
| 13     | Nascent Soul Early                |
| 14     | Nascent Soul Middle               |
| 15     | Nascent Soul Late                 |
| 16     | Nascent Soul Peak                 |
| 17     | Deity Transformation Early        |
| 18     | Deity Transformation Middle       |
| 19     | Deity Transformation Late         |
| 20     | Deity Transformation Peak         |
| 21     | Immortality                       |

3. THE SECT SYSTEM (Optional)
--------------------------------------------------------------------------------
Users may join sects for Contribution Points and Pill Discounts.

SECT STARTING SKIP (BASED ON POTENTIAL/TALENT):
- Talent 21: Start as Chosen Disciple
- Talent 17-20: Start as Core Disciple
- Talent 13-16: Start as Inner Disciple
- Talent 9-12: Start as Outer Disciple
- Talent 0: Start as Servant
- All others (1-8): Start as Servant Disciple

FULL SECT RANK & DISCOUNT TABLE (BASED ON ACTUAL RANK):
| Cultivation Rank                | Sect Rank                     | Discount |
|---------------------------------|-------------------------------|----------|
| Mortal                          | Servant                       | 0%       |
| Qi Gathering Early              | Probationary Servant Disciple | 1%       |
| Qi Gathering Middle             | Servant Disciple              | 2%       |
| Qi Gathering Late               | Probationary Outer Disciple   | 3%       |
| Qi Gathering Peak               | Outer Disciple                | 4%       |
| Foundation Establishment Early  | Probationary Inner Disciple   | 5%       |
| Foundation Establishment Middle | Inner Disciple                | 6%       |
| Foundation Establishment Late   | Probationary Core Disciple    | 7%       |
| Foundation Establishment Peak   | Core Disciple                 | 8%       |
| Core Formation Early            | Probationary Chosen Disciple  | 9%       |
| Core Formation Middle           | Chosen Disciple               | 10%      |
| Core Formation Late             | Probationary Enforcer         | 11%      |
| Core Formation Peak             | Enforcer                      | 12%      |
| Nascent Soul Early              | Probationary Minor Elder      | 13%      |
| Nascent Soul Middle             | Minor Elder                   | 14%      |
| Nascent Soul Late               | Probationary Elder            | 15%      |
| Nascent Soul Peak               | Elder                         | 16%      |
| Deity Transformation Early      | Probationary Major Elder      | 17%      |
| Deity Transformation Middle     | Major Elder                   | 18%      |
| Deity Transformation Late       | Probationary Grand Elder      | 19%      |
| Deity Transformation Peak       | Grand Elder                   | 20%      |
| Immortality                     | Ancestor                      | 21%      |

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