#Experimentation on n Puzzle


Some experimentations about finding best paths for n Puzzle with best evaluation function.

##Parameters

You can play with following parameters :

```java
    private static boolean isIAPlaying = true; // Whether the AI is playing.
    private static int size = 4; // The size of a grid side of a puzzle.
    private static int maxDepth = 15; // Depth for the search algorithm of AI. (20 is good for 3, 15 is good for 4...).
    public static int gameCount = 1; /* The number of game you want to play. Useful to do statistics with AI. 
        i.e.: Sets it to 10 and it will give you the average score game for 10 games. */
```

