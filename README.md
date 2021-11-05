# **_State's School Status During 2020-2021 School Year_**

## *Introduction Section*

* My general motivation for exploring this topic was to **learn more about the status of school systems during COVID-19**, specifically in **September vs. May**, and then manually use this found data to compare to test scores and decide if there is a correlation between the two.
* At GA we were lucky enough to be in person the entire 2020-2021 school year, though other schools did not have the same opportunity. I wanted to investigate more about this topic.
* I wanted to compare how the **north vs the south** were different in this matter.

* The **questions** I attempted to answer were...
1. What **percentage of one northern and one southern state** was **hybrid, in person, and virtual at the beginning of the school year** (September)?
2. What percentage of one northern and one southern state was **hybrid, in person, and virtual by the end of the school year** (May)?
3. Do test scores correlate with this data?


## *Methods*

* I am likely able to use this dataset because of the section on the website that **releases extra information to researchers** using their data. In their information section, the researchers explain about public data being able to be used, and say "Additionally, if you are planning to use the data for research purposes, please consider completing this CSDH Data Use Form so we can be in touch with data updates".

* The link to my dataset's website is: https://www.covidschooldatahub.com/

* This dataset was generated using data about individual states that was organized into a spreadsheet. It seems, from reading their data, that the researchers took data from districts within states each week. There are columns for start and end dates which represent this. There were also additional types of data in different spreadsheets, including type of district, learning model by division (k-5, 5-8, etc) as well as data about staff count.

* First, I looked at the data myself to thoroughly understand how it was organized and what each column meant. Then, I used pseudocode to start the percentSept method that would be used for multiple files, and similarly repeated for the May method as well. After this , I realized that the two methods were similar enough that I could combine them and add parameters to make the method work for any month. Specifically, from my data, I needed the **start/end dates from each column** to find the correct month, and the **“hybrid”, “virtual”, or “in-person”** found in a column to the right to calculate how many of each status there were in that month. I combined the data by totaling the number of districts and the number of each type of school system, and **calculated the percentages** by dividing the total number of virtual, in-person, or hybrid by the total districts found.

* One **major challenge** was that I did not expect to find **empty slots in my data**. I had to use different data sets and also figure out how to skip empty slots when counting. I had to rethink my methods, because I originally was going to analyze all of the ~30 states data sets provided on the website, but because of the widely varying data sets this did not seem possible in the amount of time we had for this project. Instead, I chose two states to compare.

* Also, I ran into issues with the indexing the columns, until I discovered the split method. Lastly, I had to troubleshoot when working with ints and doubles together.


## *Results and Conclusion*

* Through my data, I was attempting to understand how the north of the US vs. the south of the US handled schooling in the past year. I found that numbers for **in person in Ohio were higher than those from Alabama** at **both the beginning and end of the school year**, which is likely also a **theme overall** with comparing the north and the south states during COVID. The two states followed a **similar pace** from the beginning vs. end of the year (similar increases when compared to the beginning of the year).

![graph](https://github.com/eosman03/stateData/blob/main/graph.png)

* For the test score aspect of my research, I wanted to see if there is a correlation between the average standardized test score (in this case SAT testing) and the status of the school. For example, if a school was in person for more of the year, would they have higher test scores. In Ohio, the average SAT score was 1048 for 2021, while in Alabama it was 1159. As a result of these two pieces of data, I concluded that the two are not directly proportional, as in Alabama they had a higher percentage of school districts that were virtual but still had a higher test score. (Data from PrepScholar website).

* Some related or additional questions that I would explore would include taking in another data set with the test scores of each state and coding the comparison to test a correlation between the two instead of doing it manually through thought process. For this research, I looked at the data myself and made a conclusion, rather than mathematically deriving if they are related. If I had more time, I would find another data set with test scores to analyze.
