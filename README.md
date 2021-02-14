# SaavnTrendingSongs
 Project Title

MapReduce program to figure out the top 100 trending songs from Saavn’s stream data, on a daily basis, for the week December 25-31. 

## Steps 

1) In the mapper, I considered just the hour of the day, date of the month and sonID. For every record I computed the song score and outputted it as (<songID,day>,<score>)

2) I have user the decay window algorithm to get the song score. https://nitinbhojwani-tech-talk.blogspot.com/2018/12/decaying-window-algorithm.html

3)In the reducer,with the help of the combiner, I have aggregated the results per day emitted the output as (<SongID,Date>,<AggregatedSongScore>)

4)The output from the reducer was then copied as a text file and separated based on their respective days and this is done in the DaySort class

5)Once the separation was complete each of the 7 files were sorted based on score and the final list was produced by sorting in Excel



