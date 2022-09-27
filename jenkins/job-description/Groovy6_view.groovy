 
listView('Groovy6 Jobs') {
    description('Groovy6 Jobs')
    jobs {
        regex('Groovy6_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
