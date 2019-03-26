function processData(input) {
    //Enter your code here
    var input_stdin_array = _input.split("\n");
    var N = parseInt(input_stdin_array[input_currentline++]);
    for (var i = 0; i < N ; i++) {
        var s = input_stdin_array[input_currentline++];
        var even = "", odd = "";
        for (var j = 0; j < s.length ; j++) {
            if (j % 2 == 0) {
                even += s.charAt(j);
            } else {
                odd += s.charAt(j);
            }
        }
        console.log(even + " " + odd);
    }
} 
var input_currentline = 0;
process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});
