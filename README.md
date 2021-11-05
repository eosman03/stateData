# State's School Status During 2020-2021 School Year

## Introduction Section

* My general motivation for exploring this topic was to learn more about the status of school systems during COVID-19, specifically in September vs. May, and then manually use this found data to compare to test scores and decide if there is a correlation between the two.
* At GA we were lucky enough to be in person the entire 2020-2021 school year, though other schools did not have the same opportunity.
* I wanted to compare how the north vs the south were different in this matter.

* The questions I attempted to answer were...
1. What percentage of one northern and one southern state was hybrid, in person, and virtual at the beginning of the year?
2. What percentage of one northern and one southern state was hybrid, in person, and virtual by the end of the year?
3. Do test scores correlate with this data?


## Methods

* I am likely able to use this dataset because of the section on the website that releases extra information to researchers using their data. This dataset was generated using data about individual states that was organized into a spreadsheet.

* First, I looked at the data myself to thoroughly understand how it was organized and what each column meant. Then, I used pseudocode to start the percentSept method that would be used for multiple files, and similarly repeated for the May method as well. Specifically, from my data, I needed the start/end dates from each column, and the “hybrid”, “virtual”, or “in-person” found in a column to the right. I combined the data by totaling the number of districts and the number of each type of school system, and calculating a percentage using these pieces of information.

* One major challenge was that I did not expect to find empty slots in my data. I had to use different data sets and also figure out how to skip empty slots when counting.

* Also, I ran into issues with the columns, until I discovered the split method. Lastly, I had trouble with working with ints and doubles together.


## Results and Conclusion

* Through my data, I was attempting to understand how the north of the US vs. the south of the US handled schooling in the past year. I found that numbers for in person in Ohio were higher than those from Alabama at both the beginning and end of the school year, which is likely also a theme in general with comparing the north and the south states during COVID. The two states followed a similar pace from the beginning vs. end of the year (similar increases when compared to the beginning of the year).

* Some related or additional questions that I would explore would include taking in another data set with the test scores of each state and coding the comparison to test a correlation between the two instead of doing it manually through thought process.
