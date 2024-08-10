import pandas as pd
import seaborn as sns
import matplotlib.pyplot as plt

### Create two DataFrame Grass and Water

grass_df = pokemon_df[pokemon_df['Type 1'] == 'Grass']
water_df = pokemon_df[pokemon_df['Type 1'] == 'Water']

### Create the regression plots for Grass and Water

plt.figure(figsize=(10,8))
sns.regplot(
    data=grass_df, x='Attack', y="Defense",
    ci=99, marker="x", color=".3", line_kws=dict(color="r"),
)

plt.figure(figsize=(10,8))
sns.regplot(
    data=water_df, x='Attack', y="Defense",
    ci=99, marker="x", color=".3", line_kws=dict(color="r"),
)

### Calculate the Pearson correlation for each DataFrame (variables: Attack and Defense)

correlation1 = grass_df['Attack'].corr(grass_df['Defense'])
correlation2 = water_df['Attack'].corr(water_df['Defense'])

print('Grass correlation coefficient:', correlation1)
print('Water correlation coefficient:', correlation2)
