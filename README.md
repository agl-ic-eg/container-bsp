## Introduction

The `container-bsp` layer provides the BSP extension layer collection.
You use this layer collection as the linux container integration using yocto.

**NOTE:** The `container-bsp` layer include a BSP extension only.
When you want to create container image, you need to use a set of the original BSP layers.

## Layer collection

The `container-bsp` layer itself contains many layers and files.
Following is a "tree" look at the layer:

```
|-- meta-rcar-gen3-guest
|-- meta-rcar-gen3-host
|-- LICENSE
`-- README.md


