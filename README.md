<!-- initialize the repository -->  
git init<br>  
// commands for creating new branch and making changes  
git branch dev<br>  
git checkout dev<br>  
// created new files in master branch, added and committed those files  
git add testing.py git_nayan newfeature.txt<br>  
git commit -m "Added new files testing.py, git_nayan, and newfeature.txt"<br>  
// create a file in dev branch<br>  
// merging branch  
git checkout main<br>  
git merge dev<br>  
// pulling changes from GitHub to local  
git pull origin main<br>  
// git log and status to check changes  
git log<br>  
git status<br>  
// reverting and resetting changes  
git revert HEAD<br>  
git reset --hard 24ab833<br>
