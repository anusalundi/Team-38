import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv('/content/transaction_dataset.csv')

gender_counts = df['Gender'].value_counts(dropna=False)

plt.bar(gender_counts.index.astype(str), gender_counts.values, color='lightpink')
plt.title('Count of Customers by Gender')
plt.xlabel('Gender')
plt.ylabel('Count')
plt.show()

name_counts = df['Name'].value_counts().reset_index()
name_counts.columns = ['name', 'count']

top_5_names = name_counts.iloc[:5]

plt.figure(figsize=(10, 6))
plt.barh(top_5_names['name'], top_5_names['count'], color='lightblue')
plt.title('Top 5 most frequent names')
plt.xlabel('Count')
plt.ylabel('Name')
plt.gca().invert_yaxis()
plt.show()

filtered_df = df[(df['Category'] == 'Clothing') & (df['Gender'] == 'M')]

row_count = filtered_df.shape[0]

print(f"The filtered DataFrame has {row_count} rows.")
