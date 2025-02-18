// initialize the repository
git init
// commands for creating new branch and making changes
git branch dev
git checkout dev
// created new files in master branch ,added and commited that files
git add testing.py git_nayan newfeature.txt
git commit -m "Added new files testing.py, git_nayan, and newfeature.txt"
// create a file in  dev branch 
// merging branch
git checkout main
git merge dev
// pulling changes from GitHub to local
git pull origin main

// git log and status to check changes
git log
git status
// reverting and resetting changes
git revert HEAD
git reset --hard 24ab833
