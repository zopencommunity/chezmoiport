[![Automatic version updates](https://github.com/zopencommunity/chezmoiport/actions/workflows/bump.yml/badge.svg)](https://github.com/ZOSOpenTools/chezmoiport/actions/workflows/bump.yml)

# chezmoi

chezmoi helps you manage your personal configuration files (dotfiles, like ~/.gitconfig) across multiple machines.

chezmoi provides many features beyond symlinking or using a bare git repo including:

templates (to handle small differences between machines)
password manager support (to store your secrets securely)
importing files from archives (great for shell and editor plugins)
full file encryption (using gpg or age)
running scripts (to handle everything else)

# Installation and Usage

Use the zopen package manager ([QuickStart Guide](https://zopen.community/#/Guides/QuickStart)) to install:
```bash
zopen install chezmoi
```

# Building from Source

1. Clone the repository:
```bash
git clone https://github.com/zopencommunity/chezmoiport.git
cd chezmoiport
```
2. Build using zopen:
```bash
zopen build -vv
```

See the [zopen porting guide](https://zopen.community/#/Guides/Porting) for more details.

# Documentation


# Troubleshooting

# Contributing
Contributions are welcome! Please follow the [zopen contribution guidelines](https://github.com/zopencommunity/meta/blob/main/CONTRIBUTING.md).
