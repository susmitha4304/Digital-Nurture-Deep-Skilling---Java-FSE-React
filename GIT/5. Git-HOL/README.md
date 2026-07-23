# Git Cleanup and Push to Remote Repository Lab

## Objectives

- Explain how to clean up a local Git repository.
- Learn how to synchronize the local repository with the remote repository.
- Push local commits to the remote Git repository.

---

# Prerequisites

Before starting this lab, ensure you have:

- Completed **Git-T03-HOL_002 (Git Merge Conflict Resolution Lab)**
- Git installed
- Git Bash installed
- A GitHub account (Do **not** use Cognizant credentials)
- A remote GitHub repository configured as `origin`

---


# Scenario

In this lab, you will verify that the local repository is clean, synchronize it with the remote repository, and push the commits created in the previous hands-on lab.

---

# Step 1: Verify Master is in a Clean State

Switch to the master branch.

```bash
git checkout master
```

Check the repository status.

```bash
git status
```

Expected Output

```
On branch master
Your branch is ahead of 'origin/master' by 2 commits.
nothing to commit, working tree clean
```

> **Note:** If there are no pending commits, the message may simply state that your branch is up to date.

---

# Step 2: List All Available Branches

Display all local and remote branches.

```bash
git branch -a
```

Example Output

```
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master
```

---

# Step 3: Pull the Latest Changes from the Remote Repository

Update the local master branch with the latest changes from the remote repository.

```bash
git pull origin master
```

Expected Output

```
Already up to date.
```

If remote changes exist, Git will automatically download and merge them into the local repository.

---

# Step 4: Push Local Changes to the Remote Repository

Push the commits created in **Git-T03-HOL_002** to GitHub.

```bash
git push origin master
```

Expected Output

```
Enumerating objects...
Counting objects...
Writing objects...
Total ...
To https://github.com/username/repository.git
   abc1234..def5678  master -> master
```

---

# Step 5: Verify Changes in the Remote Repository

Open your GitHub repository in a web browser.

Refresh the repository page.

Verify that:

- The latest commits are visible.
- The updated files (`hello.xml`, `.gitignore`, etc.) are present.
- The commit history matches the local repository.

You can also verify using Git.

```bash
git log --oneline --graph --decorate
```

Example Output

```
* f9a8b7c (HEAD -> master, origin/master) Added backup files to .gitignore
* d6e5f4a Resolved merge conflict in hello.xml
* a1b2c3d Added hello.xml in master branch
* x7y8z9 Initial commit
```

---

# Commands Summary

| Task | Command |
|------|----------|
| Switch to Master | `git checkout master` |
| Check Repository Status | `git status` |
| List All Branches | `git branch -a` |
| Pull Latest Changes | `git pull origin master` |
| Push Changes | `git push origin master` |
| View Commit History | `git log --oneline --graph --decorate` |

---

# Result


- Verifying the local repository was clean.
- Listing available local and remote branches.
- Pulling the latest updates from the remote repository.
- Pushing local commits to the remote repository.
- Confirming that all changes were successfully reflected on GitHub.

---

# Best Practices

- Always run `git status` before committing or pushing changes.
- Pull the latest changes before pushing to avoid merge conflicts.
- Commit changes with meaningful commit messages.
- Push frequently to keep the remote repository up to date.
- Regularly verify that the remote repository reflects your latest work.

---
