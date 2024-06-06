package com.melvin.quizapp.Models;

import java.util.List;

public class QuerySpec {
    int offset;
    int limit;
    String sortOrder;
    String sortField;
    List<FilterExpression> filterExpression;

}
