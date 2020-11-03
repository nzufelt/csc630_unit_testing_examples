// Started switching over to just, using this guide: https://nodejs.org/api/readline.html
// haven't finished yet :-(
const readline = require('readline')

// First, we collect a url from users:
console.log("Enter the URL you'd like to clean up:")
const url = readline()  // <-- broken, do not use

console.log("Should we remove query strings (y/n/yes/no)?")
var remove_query_strings = readline()  // <-- broken, do not use

if (remove_query_strings == "y" || remove_query_strings == "yes"){
  remove_query_strings = True
} else {
  remove_query_strings = False
}

// Remove query strings
if (remove_query_strings) {
  url = url.split("?")[0]
}

// Extend URL
if (url.substring(0, 3) == "www") {
  // Example: "www.andover.edu"
  url = "https://" + url
} else if (url.substring(0, 4) != "http") {
  // Example: "andover.edu"
  url = "https://www." + url
}

console.log("\nThe result is: {}".format(url))
