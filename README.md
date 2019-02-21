# CSC207.01-Assignment4

1 Cooperator, 9 Defectors: the mean was 0 every time 
9 Cooperators, 1 Defector: the mean was 1 seven times and 0 three times, for a combined average of .7 
3 Cooperators, 3 Defectors, 3 PartialCooperators: the mean was .5 twice and 0 eight times, for a combined average of .1
1 Cooperator, 99 Defectors: the mean was 0 every time
99 Cooperators, 1 Defector: the mean was 0 twice and 1 eight times, for a combined average of .8
33 Cooperators, 33 Defectors, 33 PartialCooperators: the mean was 0 every time

# Paragraph 1: 1 Cooperator, 9 Defectors
    For the test with 1 Cooperator and 9 Defectors, we predicted that there would be 10 Defectors at the end of the test nearly every time (as opposed to 9 Defectors and 1 Cooperator). We reasoned that the Cooperator could never reproduce because it had no way to gain energy (because there aren’t any other Cooperators), and so the reproduction of the Defectors would most likely replace the Cooperator with a Defector. Every time we ran the test, the simulation ended with 10 Defectors, and so the average cooperation mean was 0 (as was the average of the averages). Our results seemed to fit our prediction, and we think this is because our original logic was correct.

# Paragraph 2: 9 Cooperators, 1 Defector
    Testing with 9 Cooperators and 1 Defector, we predicted that there would be 10 Cooperators at the end of the test almost every time, and we thought (similarly to the previous test) that the reproduction of the Cooperators would wipe out the small number of Defectors. However, we realized that it was possible for the Defector to reproduce, so we thought that there might be a few Defectors at the end of the test a few times. The cooperation mean was 1 seven times and 0 three times, which gives us an average cooperation mean of .7. The results are close to our prediction, but not quite. We were surprised at how often the Defectors “took over,” with there being 10 Defectors at the end every once in awhile. This is probably because we underestimated the extent to which the Defectors benefited from the existence of the Cooperators, so the Defectors did better than expected.

# Paragraph 3: 3 Cooperators, 3 Defectors, 3 PartialCooperators
    With three of each type, we thought that at the end of the simulation, the number of organisms of each type would be approximately equal. Because no type of organism had a numerical advantage, we thought that they wouldn’t be able to wipe each other out through reproduction. In our experiments, we had a cooperation mean of .5 twice and a cooperation mean of 0 eight times, which gives an average cooperation mean of .1. This did not match our prediction because the Defectors seemed to be “taking over” the vast majority of the time. We think this is because the Defectors were taking energy from the Cooperators and PartialCooperators in order to reproduce faster.

# Paragraph 4: 1 Cooperator, 99 Defectors
    According to our logic with 1 Cooperator and 9 Defectors, it would be impossible for the Cooperator to reproduce. We thus predicted it would be highly unlikely for the Cooperator to survive through 100 updates and expected 100 Defectors at the end. Our prediction proved correct; every test gave 100 Defectors and an average cooperation mean of 0.

# Paragraph 5: 99 Cooperators, 1 Defector
    We anticipated a mix of results between 100 Cooperators and 100 Defectors, but we were not sure whether there would be more instances of Cooperator takeovers or more instances of Defector takeovers. The cooperation mean came out as 1 eight times and 0 two times, thus giving an overall mean of .8 which is slightly higher than the cooperation mean with 9 Cooperators and 1 Defector. While our prediction of mixed results was true, it remains inconclusive whether a greater population assists Cooperators or Defectors. While the overall cooperation mean was higher with a higher population, there was only one more instance of Cooperators taking over than there was with a sample size of 10.

# Paragraph 6: 33 Cooperators, 33 Defectors, 33 PartialCooperators
    With an even split between Cooperators, Defectors, and PartialCooperators at a smaller scale, Defectors almost always took over the population, though PartialCooperators took over the population once. With that in mind, we predicted Defectors to take all 99 spaces in the population almost all of the time, but we considered the possibility that PartialCooperators might successfully overtake the population once. However, a larger population size instead seemed to lend itself to greater extremism. The cooperation mean remained constant at 0 for every experiment, and every population ended with 99 Defectors.

# Paragraph 7: Conclusion
    We had questions about the realism of the required populations. For instance, we questioned the realism of a bound population size as well as how energy levels didn’t impact whether an Organism was more or less likely to be replaced by another Organism. Both cases could change the results we received and keep the population more mixed than any of our experiments indicated.
    With that said, we overall found that if the simulation had lots of Cooperators, the organisms seemed to have an abundance of energy and were able to reproduce faster. However, if there were enough Defectors or PartialCooperators (even having one Defector would put the Cooperators in danger), the simulation quickly went badly for the Cooperators, as the Defectors/PartialCooperators would free-ride from the energy of the Cooperators in order to quickly reproduce and take over. Overall, this reminds us of game theory, where the group is better off if every organism is a cooperator, but it is individually beneficial for an organism to be a Defector—Defectors can reap the rewards of everyone else’s cooperation without having to contribute, and if everyone else is being a Defector, you certainly want to be a Defector so that you can increase your own energy. 

