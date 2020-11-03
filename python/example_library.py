# First, we collect a url from users:
url = input("Enter the URL you'd like to clean up:\n")

remove_query_strings = input("Should we remove query strings (y/n/yes/no)?\n")

if remove_query_strings == "y" or remove_query_strings == "yes":
    remove_query_strings = True
else:
    remove_query_strings = False

# Remove query strings
if remove_query_strings:
    url = url.split("?")[0]

# Extend URL
if url[:3] == "www":
    # Example: "www.andover.edu"
    url = "https://" + url
elif url[:4] != "http":
    # Example: "andover.edu"
    url = "https://www." + url

print("\nThe result is: {}".format(url))
















"""
Good things to make sure work:
* andover.edu -> https://www.andover.edu
* www.andover.edu -> https://www.andover.edu
* wikipedia.com -> https://www.wikipedia.com   (Starts with a w)
* https://www.youtube.com/watch?v=e4BdyyVEJks -> https://www.youtube.com/watch   (strip query strings)
"""
