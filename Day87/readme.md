## Problem Statement
Flatland is a country with a number of cities, some of which have space stations. Cities are numbered consecutively and each has a road of 1 km length connecting it to the next city. It is not a circular route, so the first city doesn’t connect with the last city. Determine the maximum distance from any city to it’s nearest space station.

For example, there are n=3 cities and m=1 of them has a space station, city 1. They occur consecutively along a route. City 2 is 2-1=1 unit away and city 3 is 3-1=2 units away. City 1 is 0 units from its nearest space station as one is located there. The maximum distance is 2.

## Function Description

Complete the flatlandSpaceStations function in the editor below. It should return an integer that represents the maximum distance any city is from a space station.

flatlandSpaceStations has the following parameter(s):

- n: the number of cities
- c: an integer array that contains the indices of cities with a space station, 1-based indexing

## Input Format

- The first line consists of two space-separated integers, n and m.
- The second line contains m space-separated integers, the indices of each city having a space-station. These values are unordered and unique.

## Output Format

Print an integer denoting the maximum distance that an astronaut in a Flatland city would need to travel to reach the nearest space station.

## Sample Input
```
5 2
0 4
```
## Sample Output
```
2
```