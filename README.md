# Requious Frakto Unofficial

Fork [Requious Frakto](https://github.com/DaedalusGame/RequiousFrakto) with some optimizations and additional features

## Note
> This fork was originally made for personal use. Since a few people expressed interest in it, we decided to make it publicly available on CurseForge.
>
> We do not have plans to actively maintain or further develop this project, so please keep that in mind when using it.
>
> We do not claim ownership of the original mod. Huge thanks to the original author for their work. This fork exists simply to bring a few improvements and refinements to  mod.
>
> The original license is preserved and can be found in [LICENSE](LICENSE).


## Features
Everything is based on original mod, but some more usable modifications have been made

- JEI Slot placement grid has been changed, now it is a multiple of 9 pixels instead of 18
- New ZenMethods and JSON machine settings
- Switching the interaction with energy to long values (compatible with [Flux Network](https://www.curseforge.com/minecraft/mc-mods/flux-networks))
- Includes [IC2-No](https://github.com/XHL315/IC2-No) to fix compatibility with Industrial Craft 2
- Compatible with [Lumenized](https://www.curseforge.com/minecraft/mc-mods/lumenized)
- Compatible with [ItemBorders](https://www.curseforge.com/minecraft/mc-mods/item-borders)

## New ZenMethods

- mods.requious.Assembly
  - `setEUSlot(x as int, y as int, face as ComponentFace, capacity as int)` - from IC2-No
- mods.requious.AssemblyRecipe
  - `requireEU(group as string, energy as int, @Optional mark as string)` - from IC2-No
  - `requireEU(group as string, min as int, max as int, @Optional mark as string)` - from IC2-No
  - `addJEIInfo(group as string, tooltips as string[], slotVisual as SlotVisual)` - add a multi-line info tooltip
- mods.requious.RecipeContainer
  - `addEUOutput(group as string, energy as int)` - from IC2-No
  - `addEUOutput(group as string, energy as int, minInsert as int)` - from IC2-No
  - `addJEIInfo(group as string, tooltips as string[], slotVisual as SlotVisual)` - add a multi-line info tooltip
- mods.requious.MachineContainer
  - `getFloat(name as string)` - get float variable
  - `setFloat(name as string, value as float` - set float variable
  - `getLong(name as string)` - get long variable 
  - `setLong(name as string, value as long` - set long variable
  - `getSlotCapacity(x as int, y as int)` - get energy slot capacity
  - `setPushEnergySlotSize(x as int, y as int, pushEnergy as long)` - set pushing energy value on energy slot
  - `getPushEnergySlotSize(x as int, y as int)` - get pushing energy value on energy slot
  - `setEnergySlotMaxInput(x as int, y as int, input as long)` - set max input energy per tick on energy slot
  - `setEnergySlotMaxOutput(x as int, y as int, output as long)` - set max output energy per tick on energy slot
  - `isActive(x as int, y as int)` - returns whether the duration slot is active
  - `setDurationData(x as int, y as int, active as bool, duration as int, time as int)` - set duration slot data
- mods.requious.ItemSlot
  - `onSlotChanged(slotChangedFunction as function(machineContainer as MachineContainer))` - do something when the contents of the item slot have changed
- mods.requious.Random
  - `nextFloat()` - Returns the pseudorandom, uniformly distributed float value between 0.0 and 1.0
- mods.requious.Mics
  - `formatNumber(value as long)` - returns a beautiful abbreviated string representation of the value, for example: 100000 -> 100.0K

## New JSON machine settings
- `pathTextureGui` - path to gui texture, for example: `textures/gui/assembly.png`
- `moveSlotPosX` - Offset the grid of custom slots on X position by the specified number of pixels
- `moveSlotPosY` - Offset the grid of custom slots on Y position by the specified number of pixels
- `moveInvSlotsPosX` - Offset the grid of player inventory slots on X position by the specified number of pixels
- `moveInvSlotsPosY` - Offset the grid of player inventory slots on Y position by the specified number of pixels
- `overGuiSizeX` - increase the width of the gui by the specified value (by default, the width of the GUI is 176)
- `overGuiSizeY` - increase the height of the gui by the specified value (by default, the height of the GUI is 184)

## Credits
- BordListian (@DaedalusGame) - original mod author
- superhelo (@XHL315) - IC2-No author
