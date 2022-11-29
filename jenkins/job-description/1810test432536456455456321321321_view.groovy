 
listView('1810test432536456455456321321321 Jobs') {
    description('1810test432536456455456321321321 Jobs')
    jobs {
        regex('1810test432536456455456321321321_.+')
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
